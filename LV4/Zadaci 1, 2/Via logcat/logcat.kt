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

        val robot = Robot()
        robot.goRight(5)
        robot.goUp(9)
        println(robot.getLocation())
    }
}
data class Ingredient(
    @DrawableRes val image: Int = 0,
    var title: String = "",
    var subtitle: String = ""
)

data class Recipe(
    @DrawableRes val image: Int = 0,
    var title: String = "",
    var category: String = "",
    var cookingTime: Float = 0f,
    var energy: Int = 0,
    var rating: Float = 0f,
    var description: String = "",
    var reviews: String = "",
    var ingredients: List<Ingredient>? = null
)

class Robot{
    var x: Int = 0
    var y: Int = 0

    fun goRight(steps: Int){
        x+=steps
    }
    fun goLeft(steps: Int){
        x-=steps
    }
    fun goDown(steps: Int){
        y-=steps
    }
    fun goUp(steps: Int){
        y+=steps
    }
    fun getLocation(): String{
        return "(${x}, ${y})"
    }
}
