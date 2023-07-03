

fun main(){
    val myArray1 = intArrayOf(7,11,15,2)

    twoSum1(myArray1,9)
    // 0 -> println(0)
    twoSum1(myArray1,9).forEach { v -> println(v) }

}

//O(n)^2, two pointer method
fun twoSum(nums: IntArray, target: Int): IntArray {

    for (i in nums.indices){
        for(j in i+1 until nums.size ){ //checks from the right side of i
            if (nums[i] + nums[j] == target)
        return intArrayOf(i,j)
        }
    }
    return intArrayOf()
}

fun twoSum1(nums: IntArray, target: Int): IntArray{
    var i = 0
    while (i < nums.size){

        var j = i+1
        while (j < nums.size) {
            if (nums[i] + nums[j] == target) {
                return intArrayOf(i, j)
            }
            j++
        }
        i++

    }
    return intArrayOf()
}

//O(n)

fun twoSumFaster(nums: IntArray,target: Int) :IntArray{
    val myMap = HashMap<Int, Int>()

    for(i in 0 until nums.size){
       val key = target-nums[i]
        if (myMap.containsKey(key)){
            return intArrayOf(myMap.get(key)as Int,i) //if key exist return value or return null if the key doesn't exist
        }else
        {
            myMap.put(nums[i],i) //it either replaces/updates the value or insert a new key value pair
        }

    }
    return intArrayOf()

}





