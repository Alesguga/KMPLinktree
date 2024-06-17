import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.DrawableResource

data class LinkItem (
    val name : String,
    val url : String,
    val bgColor : Color,
    val bgColorHover : Color = Color.White,
    val icon : DrawableResource,
    val textColor : Color = Color.White,
    val textColorHover : Color = bgColor
)