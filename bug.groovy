def list = [1, 2, 3, 4, 5]

println list.eachWithIndex { item, index ->
    if (index > 2) {
        list.remove(item)
    }
}

println list