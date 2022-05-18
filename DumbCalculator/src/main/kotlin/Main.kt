// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
@Composable
fun ColumnWithTwoButtons() {
    Column {
        Button(
            onClick = { println("hello, world!") },
        ) {

            Text("I am a button")
        }
        Button(
            onClick = { println("hello, world!") },
        ) {
            Text("I am a button")
        }
    }
}

@Composable
fun Message(message: String, removeMessage: () -> Unit) {
    Row {
        Surface(elevation = 1.dp) {
            Row(modifier = Modifier.padding(16.dp)) {
                Text(message)
                Button(removeMessage) {
                    Text("Remove Message")
                }
            }
        }
    }
}

@Composable
fun App() {
    MaterialTheme {
//        var numColumns by remember { mutableStateOf(0) }
        var message by remember { mutableStateOf("") }
        val messages = remember { mutableStateListOf<String>() }
        Column {

            Row {
                Button({
                    messages.add(message)
                }) {
                    Text("AddMessage")
                }
                TextField(message, onValueChange = {message = it})
            }
            Row {
                LazyColumn {
                    items(messages, key = {
                        it
                    }) { message ->
                        Message(message) { messages.remove(message) }
                    }
                }
            }
        }

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
