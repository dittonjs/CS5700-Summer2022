// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

@Composable
fun StopWatchView(viewHelper: ViewHelper, coroutineScope: CoroutineScope) {

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Text("${viewHelper.numSecondsPassed}", fontSize = 100.sp)
    }
    Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
        IconButton(onClick = {
            coroutineScope.launch {
                viewHelper.start()
            }
        }) {
            Icon(Icons.Default.PlayArrow, "Play")
        }
        IconButton(onClick = {
            viewHelper.stop()
        }) {
            Icon(Icons.Filled.ThumbUp, "Stahp")
        }
        IconButton(onClick = {
            viewHelper.reset()
        }) {
            Icon(Icons.Filled.Home, "Reset")
        }
    }
}

@Composable
@Preview
fun App() {
    val viewHelpers = remember { mutableStateListOf<ViewHelper>()}
    MaterialTheme {
        val coroutineScope = rememberCoroutineScope()
        Column {
            Row {
                IconButton(onClick = {
                    viewHelpers.add(ViewHelper())
                }) {
                    Icon(Icons.Default.Edit, "Create new stopwatch")
                }
            }
            LazyColumn {
                items(viewHelpers) { viewHelper ->
                    StopWatchView(viewHelper, coroutineScope)
                }
            }
        }
    }
}

fun main() = runBlocking {
    launch {

    }

    application {
        Window(onCloseRequest = ::exitApplication) {
            App()
        }
    }
}

