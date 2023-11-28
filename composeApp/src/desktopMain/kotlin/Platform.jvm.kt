class JVMPlatform : Platform {
    override val name: String = "macOS"
}

actual fun getPlatform(): Platform = JVMPlatform()