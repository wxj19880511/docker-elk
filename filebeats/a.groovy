def a = new XmlParser().parse("output.xml")
a.suite.test.each { 
    println(it.@name)
    println(it.status.@status[0])

    def ax = []
    it.tags.tag.each {
        ax.add(it.text())
    }
    println(ax)
}