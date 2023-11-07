package Interface

interface StringProvider {
    fun getString(id: Int): String
}


class DefaultResourceProvider : StringProvider {
    override fun getString(id: Int): String {
        return "id: $id"
    }
}