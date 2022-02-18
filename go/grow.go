// 8 kyu Beginner - Reduce but Grow

package kata

func Grow(arr []int) int{
  res := 1
  for i := 0; i < len(arr); i++ {
    res *= arr[i]
  }
  return res
}