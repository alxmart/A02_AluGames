import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers

fun main() {

    val client: HttpClient = HttpClient.newHttpClient()

    val request = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=146"))
        .build()

    val response = client
        .send(request, BodyHandlers.ofString())

    val json = response.body()

    println(json)

   /*
   val meujogo = Jogo(
        "Batman: Arkham Asylum Game of the Year Edition",
        "https:\\/\\/cdn.cloudflare.steamstatic.com\\/steam\\/apps\\/35140\\/capsule_sm_120.jpg?t=1702934705")
    //meujogo.titulo = "Batman: Arkham Asylum Game of the Year Edition"
    //meujogo.capa = "https:\\/\\/cdn.cloudflare.steamstatic.com\\/steam\\/apps\\/35140\\/capsule_sm_120.jpg?t=1702934705"
    println(meujogo.toString())

    val novoJogo = Jogo(
        capa =  "https:\\/\\/cdn.cloudflare.steamstatic.com\\/steam\\/apps\\/35140\\/capsule_sm_120.jpg?t=1702934705",
        titulo = "Batman: Arkham Asylum Game of the Year Edition")
    println(novoJogo.toString())
    */

    val gson = Gson()
    val meuJogo = gson.fromJson(json, Jogo::class.java)
    println(meuJogo)

}