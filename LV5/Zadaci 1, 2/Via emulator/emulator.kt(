package com.orwima.myapplication

import android.os.Bundle
import androidx.annotation.DrawableRes
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.orwima.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val robot = Robot(0,0)
                    robot.goRight(5)
                    robot.goUp(9)

                    Greeting(
                        name = "${robot.getLocation()}",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

data class Ingredient(

    @DrawableRes val image: Int = 0,
    val title: String = "",
    val subtitle: String = ""
)
data class Recipe(
    @DrawableRes val image: Int = 0,
    val title: String = "",
    val category: String = "",
    val cookingTime: Float = 0f,
    val energy: Int = 0,
    val rating: Float = 0f,
    val description: String = "",
    val reviews: String = "",
    val ingredients: List<Ingredient>?=null)

class Robot(var x: Int, var y: Int) {

    fun goRight(steps: Int){

        x += steps
    }

    fun goLeft(steps:Int){

        x -= steps
    }

    fun goDown(steps: Int){

        y -= steps
    }

    fun goUp(steps: Int){

        y += steps
    }

    fun getLocation() : String{

        return "($x, $y)"
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "$name",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("")
    }
}
