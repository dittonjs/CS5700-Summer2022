// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    val drawing = remember { Drawing() }
    val viewHelper = remember { ViewHelper(drawing) }

    MaterialTheme {
        Column {
            Row {
                Button(onClick = {
                    viewHelper.setCommand(DrawCircleCommand(drawing))
                }) {
                    Text("Circle")
                }
                Button(onClick = {
                    viewHelper.setCommand(DrawRectCommand(drawing))
                }) {
                    Text("Rect")
                }
                Button(onClick = {
                    viewHelper.undo()
                }) {
                    Text("Undo")
                }
            }
            Row {
                Canvas(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .pointerInput(Unit) {
                        detectTapGestures {
                            viewHelper.executeCommand(it)
                        }
                    }) {

                    drawing.shapes.forEach {
                        it.draw(this)
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
