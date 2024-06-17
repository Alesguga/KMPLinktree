import androidx.compose.ui.graphics.Color
import linktree.composeapp.generated.resources.*
import linktree.composeapp.generated.resources.Res
import linktree.composeapp.generated.resources.github

object LinksProvider {
    val items= listOf(
        LinkItem(
            name = "GitHub",
            url = "https://github.com/alesguga",
            bgColor = Color.Black,
            icon = Res.drawable.github
        ),
        LinkItem(
            name = "Instagram",
            url = "https://www.instagram.com/aleex_gutierrezz/",
            bgColor = RojoM,
            icon = Res.drawable.instagram_logo
        ),
        LinkItem(
            name = "LinkedIn",
            url = "https://www.linkedin.com/in/alejandro-guti%C3%A9rrez-4b863b295",
            bgColor = BlueL,
            icon = Res.drawable.linkedin
        ),
        LinkItem(
            name = "Mi portfolio",
            url = "https://gutigut.com",
            bgColor = Orange,
            icon = Res.drawable.portfolio_logo
        ),LinkItem(
            name = "Twitter",
            url = "https://x.com/aalexgutierrez7",
            bgColor = GrisO,
            icon = Res.drawable.twitter_logo
        ),
        LinkItem(
            name = "Reddit",
            url = "https://www.reddit.com/user/alesguru/",
            bgColor = OrangeR,
            icon = Res.drawable.reddit_logo
        )
        //Aqui puedes añadir mas redes sociales, como plazcas.
    )
}