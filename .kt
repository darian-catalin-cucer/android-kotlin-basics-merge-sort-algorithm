fun mergeSort(arr: IntArray) {
    if (arr.size < 2) return
    
    val mid = arr.size / 2
    val left = arr.copyOfRange(0, mid)
    val right = arr.copyOfRange(mid, arr.size)
    
    mergeSort(left)
    mergeSort(right)
    
    merge(left, right, arr)
}

fun merge(left: IntArray, right: IntArray, arr: IntArray) {
    var i = 0
    var j = 0
    var k = 0
    
    while (i < left.size && j < right.size) {
        if (left[i] <= right[j]) {
            arr[k++] = left[i++]
        } else {
            arr[k++] = right[j++]
        }
    }
    
    while (i < left.size) {
        arr[k++] = left[i++]
    }
    
    while (j < right.size) {
        arr[k++] = right[j++]
    }
}
