import io.ktor.server.netty.*
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.engine.*

object WebServer {
    init {
        embeddedServer(Netty, 8080) {
            routing {
                get("/") {
                    println(call.parameters["shipmentId"])
                    println(call.parameters["type"])

                    call.respondText("<h1>Hello, world!</h1>", ContentType.Text.Html)
                }

                post ("/"){

                }
            }
        }.start(wait = true)
    }

}