class Diamond {
    companion object {
        fun shape(size: Int): String {
            if (size == 1) return "A"

            val lines = mutableListOf<String>()

            for (level in 1..size) {
                lines.add(createLine(size, level))
            }

            lines.addAll(lines.take(lines.lastIndex).reversed())

            return lines.joinToString("\n").also { println(it) }
        }


        private fun createLine(size: Int, level: Int): String {
            val padding = createPadding(size, level)
            val content = createContent(level)

            return "$padding$content$padding"
        }

        private fun createContent(level: Int): String {
            if (level == 1) return "A"

            val letter = ('A'.toInt() + level - 1).toChar()

            val spaceCount = level * 2 - 3
            var spaces = ""
            repeat(spaceCount) { spaces += " " }

            return "$letter$spaces$letter"
        }

        private fun createPadding(size: Int, boundary: Int): String {
            var padding = ""
            for (index in 1..size - boundary) {
                padding += " "
            }
            return padding
        }
    }
}