def list = [1, 2, 3, 4, 5]

def newList = []

list.eachWithIndex { item, index ->
    if (index <=2) {
        newList << item
    }
}

println newList

//Alternative solution using an iterator and index
list = [1, 2, 3, 4, 5]
index = 0
it = list.iterator()
while (it.hasNext()) {
    if(index > 2){
        it.remove()
    }
    it.next()
    index++
}
println list