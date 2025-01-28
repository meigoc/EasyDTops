import org.bukkit.plugin.java.JavaPlugin

class MyPlugin : JavaPlugin() {
    override fun onEnable() {
        println("--------------------")
        println("Plugin is enabling...")
        println("GitHub: github.com/meigoc/EasyDTops")
        println("--------------------")
    }

    override fun onDisable() {
        println("--------------------")
        println("Plugin is disabling...")
        println("GitHub: github.com/meigoc/EasyDTops")
        println("--------------------")
    }
}
