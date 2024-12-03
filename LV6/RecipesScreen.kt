//Na Merlinu ima .zip sa jpg/jpeg/png i xml, na satu ce vam objasnit gdje to stavljate u projektu
//U Color.kt se dodaju identifikatori boja zbog referenciranja
package com.example.orwima_ivelic.ui.theme  //ovaj dio ovisi kako nazovete svoj projekt/package, po defaultu bude 'package com.orwima.myapplication.ui.theme'

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import com.example.orwima_ivelic.R  //ovaj dio ovisi kako nazovete svoj projekt/package
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.layout.ContentScale

data class Recipe(
    @DrawableRes val image: Int,
    val title: String,
    val category: String,
    val cookingTime: String,
    val energy: String,
    val rating: String,
    val description: String,
    val reviews: String,
    val ingredients: List<Ingredient>
)

data class Ingredient(
    @DrawableRes val image: Int,
    val title: String,
    val subtitle: String
)

val recipes: List<Recipe> = listOf(
    Recipe(
        image = R.drawable.strawberry_pie_1,
        title = "Strawberry Cake",
        category = "Desserts",
        cookingTime = "50 min",
        energy = "620 kcal",
        rating = "4,9",
        description = "This dessert is very tasty and not difficult to prepare. Also, you can replace strawberries with any other berry you like.", reviews = "84 photos 430 comments",
        ingredients = listOf(
            Ingredient(R.drawable.flour, "Flour", "450 g"),
            Ingredient(R.drawable.eggs, "Eggs", "4"),
            Ingredient(R.drawable.juice, "Lemon juice", "150 g"),
            Ingredient(R.drawable.strawberry, "Strawberry", "200 g"),
            Ingredient(R.drawable.suggar, "Sugar", "1 cup"),
            Ingredient(R.drawable.mint, "Mint", "20 g"),
            Ingredient(R.drawable.vanilla, "Vanilla", "1/2 teaspoon"),
        )
    ),
    Recipe(
        image = R.drawable.strawberry_pie_1,
        title = "Strawberry Cake2",
        category = "Desserts",
        cookingTime = "50 min",
        energy = "620 kcal",
        rating = "4,9",
        description = "This dessert is very tasty and not difficult to prepare. Also, you can replace strawberries with any other berry you like.", reviews = "84 photos 430 comments",
        ingredients = listOf(
            Ingredient(R.drawable.flour, "Flour", "450 g"),
            Ingredient(R.drawable.eggs, "Eggs", "4"),
            Ingredient(R.drawable.juice, "Lemon juice", "150 g"),
            Ingredient(R.drawable.strawberry, "Strawberry", "200 g"),
            Ingredient(R.drawable.suggar, "Sugar", "1 cup"),
            Ingredient(R.drawable.mint, "Mint", "20 g"),
            Ingredient(R.drawable.vanilla, "Vanilla", "1/2 teaspoon"),
        )
    ),
    Recipe(
        image = R.drawable.strawberry_pie_1,
        title = "Strawberry Cake3",
        category = "Desserts",
        cookingTime = "50 min",
        energy = "620 kcal",
        rating = "4,9",
        description = "This dessert is very tasty and not difficult to prepare. Also, you can replace strawberries with any other berry you like.", reviews = "84 photos 430 comments",
        ingredients = listOf(
            Ingredient(R.drawable.flour, "Flour", "450 g"),
            Ingredient(R.drawable.eggs, "Eggs", "4"),
            Ingredient(R.drawable.juice, "Lemon juice", "150 g"),
            Ingredient(R.drawable.strawberry, "Strawberry", "200 g"),
            Ingredient(R.drawable.suggar, "Sugar", "1 cup"),
            Ingredient(R.drawable.mint, "Mint", "20 g"),
            Ingredient(R.drawable.vanilla, "Vanilla", "1/2 teaspoon"),
        )
    )
)
@Preview(showBackground=true)
@Composable
fun RecipesScreen(){
    Column(
        verticalArrangement=Arrangement.Top,
        horizontalAlignment =Alignment.CenterHorizontally,
        modifier=Modifier.fillMaxSize()
    ){
        ScreenTitle(
            title="What would you like to cook today?",
            subtitle="Good morning, Elio"
        )
        SearchBar(
            iconSource = R.drawable.ic_search,
            labelText = "Search recipes"
        )
        RecipeCategories()
        Row {
            RecipeCard(imageResource = R.drawable.strawberry_pie_1, title = "Strawberry Cake")
            Spacer(Modifier.width(6.dp))
            RecipeCard(imageResource = R.drawable.strawberry_pie_2, title = "Strawberry Cake 2")
        }
        //
        Spacer(modifier = Modifier.height(16.dp))

        IconButton(
            iconSource = R.drawable.ic_plus,
            text = "Add new recipe"
        )
        //
        Spacer(modifier = Modifier.height(10.dp))
        Chip("Dessert",)
    }
}
@Composable
fun ScreenTitle(
    title:String,
    subtitle:String
){
    Box(
        modifier=Modifier
            .padding(top=16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = subtitle,
            style = TextStyle(color = Purple500, fontSize = 12.sp, fontWeight = FontWeight.Light, fontStyle =
            FontStyle.Italic),
            modifier = Modifier.padding(horizontal = 15.dp, vertical = 15.dp)
        )
        Text(
            text = title,
            style = TextStyle(color = Color.Black, fontSize = 26.sp, fontWeight = FontWeight.Bold),
            modifier = Modifier.padding(vertical = 25.dp, horizontal = 25.dp)
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar(
    @DrawableRes iconSource:Int,
    labelText:String,
    colors: TextFieldColors = TextFieldDefaults.textFieldColors(
        containerColor = Color.Transparent,
        unfocusedPlaceholderColor = DarkGray,
        unfocusedTextColor = DarkGray,
        focusedTextColor = DarkGray,
        unfocusedLabelColor = DarkGray,
        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent
    )
) {
    var searchInput by remember {
        mutableStateOf("")
    }
    TextField(
        value = searchInput,
        onValueChange = { searchInput = it },
        label = {
            Text(labelText)
        },
        leadingIcon = {
            Icon(
                painter = painterResource(id = iconSource),
                contentDescription = labelText,
                tint = DarkGray,
                modifier = Modifier
                    .width(16.dp)
                    .height(16.dp)
            )
        },
        colors = colors,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    )
}
@Composable
fun TabButton(
    modifier: Modifier = Modifier,
    text:String,
    isActive:Boolean,
    onClick:()->Unit
){
    Button(
        shape= RoundedCornerShape(24.dp),
        elevation=null,
        colors = if (isActive) ButtonDefaults.buttonColors(contentColor = Color.White, containerColor =
        PinkA400) else ButtonDefaults.buttonColors(contentColor = DarkGray, containerColor = LightGray),
        modifier=Modifier.fillMaxHeight(),
        onClick={ onClick() }
    ){
        Text(text)
    }
}
@Composable
fun RecipeCategories(){
    var currentActiveButton by remember{mutableStateOf(0)}
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(horizontal = 16.dp, vertical = 16.dp)
            .background(Color.Transparent)
            .fillMaxWidth()
            .height(44.dp)
    ){
        TabButton(text="All",isActive=currentActiveButton==0){
            currentActiveButton=0
        }
        TabButton(text="Breakfast",isActive=currentActiveButton==1){
            currentActiveButton=1
        }
        TabButton(text="Lunch",isActive=currentActiveButton==2){
            currentActiveButton=2
        }
    }
}
@Composable
fun IconButton(
    @DrawableRes iconSource: Int,
    text:String
){
    Button(
        onClick={/*TO DO*/},
        colors=ButtonDefaults.buttonColors(containerColor= PinkA400)
    ){
        Row{
            Icon(
                painter = painterResource(id=iconSource),
                contentDescription = text
            )
            Spacer(Modifier.width(2.dp))
            Text(
                text=text,
                style=TextStyle(
                    fontSize=16.sp,
                    fontWeight=FontWeight.Light
                )
            )
        }
    }
}
@Composable
fun Chip(
    text:String,
    backgroundColor: Color = Color.White,
    textColor: Color = Purple500,
){
    Box(
        modifier=Modifier.background(
            color=backgroundColor,
            shape=RoundedCornerShape(12.dp)
        )
            .clip(RoundedCornerShape(12.dp))
            .padding(horizontal=8.dp,vertical=2.dp)
    ){
        Text(
            text=text,
            color=textColor,
            fontSize=12.sp
        )
    }
}

//SAMOSTALAN RAD - ZADATAK

@Composable
fun RecipeCard(
    @DrawableRes imageResource: Int,
    title: String
) {
    Card(
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color.LightGray),
        modifier = Modifier
            .width(215.dp)
            .height(326.dp)
            .padding(bottom = 8.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = imageResource),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(12.dp))
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 10.dp, vertical = 10.dp),
                verticalArrangement = Arrangement.Bottom,

            ) {
                Text(title, color = Color.White)
                Row {
                    Chip("30 min")
                    Spacer(Modifier.width(4.dp))
                    Chip("4 ingredients")
                }
            }
        }
    }
}
