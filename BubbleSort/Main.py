# Implementation of Bubble Sort.

# Compares element at index i to element at i + 1. If list[i + 1] > list[i],
# then function swaps the 2 elements. Does this for the length of the list, and
# repeats for the length of the list times. There are some optimizations to
# lower the amount of repeats needed that will be highlighted below

# Worst case time complexity is O(n^2). In the reverse order, every element not sorted
# has to be pushed to the front of the list. The minimum which would be in the last position
# takes all iterations of size(list) to make it to the front unfortunately. Best case is when
# its already sorted, we just look at each element once so O(n).
def bubbleSort(numbers : list) -> list:
    size = len(numbers)
    swapped = False
    for _ in range (0, size):
        for i in range(1, size):
            if (numbers[i] < numbers[i - 1]):
                numbers[i], numbers[i - 1] = numbers[i - 1], numbers[i]
                swapped = True 
                
        # if no swaps are made in a whole pass of the array, then its sorted,
        # so we don't need more iterations of swapping - optimization
        if (not swapped):
            break;
            
    return numbers

if __name__ == '__main__':
    L1 = [10, 11, 12, 13, 14, 15, 16, 17, 18]
    L2 = [19, 18, 17, 16, 15]
    L3 = [23, 7, 66, 2, 88, 99, 100]
    L4 = [754, 231, 250, 378]
    L5 = [1, 777, 923, 234, 345, 45, 30]
    
    print(str(L1) + " sorted to " + str(bubbleSort(L1)) + "\n")
    print(str(L2) + " sorted to " + str(bubbleSort(L2)) + "\n")
    print(str(L3) + " sorted to " + str(bubbleSort(L3)) + "\n")
    print(str(L4) + " sorted to " + str(bubbleSort(L4)) + "\n")
    print(str(L5) + " sorted to " + str(bubbleSort(L5)) + "\n")
    
# Output
'''
[10, 11, 12, 13, 14, 15, 16, 17, 18] sorted to [10, 11, 12, 13, 14, 15, 16, 17, 18]

[19, 18, 17, 16, 15] sorted to [15, 16, 17, 18, 19]

[23, 7, 66, 2, 88, 99, 100] sorted to [2, 7, 23, 66, 88, 99, 100]

[754, 231, 250, 378] sorted to [231, 250, 378, 754]

[1, 777, 923, 234, 345, 45, 30] sorted to [1, 30, 45, 234, 345, 777, 923]
'''