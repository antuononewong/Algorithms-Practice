# Implementation of Insertion Sort
#
# Insertion sort takes in a list of numbers.  It begins by
# starting comparisons at the 2nd element. The current element at index i is compared to
# its closest left element at index i-1, and if it's smaller, do a swap. It'll compare
# to it's closest left element again and swap if its smaller. However,
# if it's larger, then function moves on to the next element at index i + 1. Rinse and repeat
# until we reach the end of the list where it will be sorted.

# This implementation is O(n^2). In the worst case, it sorts a list in reverse order,
# which causes the maximum number of swaps. Each new element will have to iterate through
# the entire sorted subsequence. In the best case, we sort an already sorted list, so no 
# swaps are made. Basically just searching through the list linearly.  Insertion Sort is
# a good way to check for an already sorted list since it can be done in O(n).  ALso, it
# can be used as parts of other known sorts for optimizations.

def insertionSort(numbers : list) -> list:
    for i in range (1, len(numbers)):
        while (i > 0):
            if (numbers[i - 1] > numbers[i]):
                numbers[i], numbers[i-1] = numbers[i-1], numbers[i]
                i-=1
            else:
                i-=1
                break
        
    return numbers

if __name__ == '__main__':
    L1 = [3, 4, 5, 6, 7, 8]
    L2 = [9, 8, 7, 6, 5, 4, 3, 2, 1]
    L3 = [17, 2, 19, 21, 7, 1, 43]
    L4 = [1, 2, 56, 52, 47, 18]
    L5 = [260, 77, 45, 98]
    
    print(str(L1) + " sorted to " + str(insertionSort(L1)) + "\n")
    print(str(L2) + " sorted to " + str(insertionSort(L2)) + "\n")
    print(str(L3) + " sorted to " + str(insertionSort(L3)) + "\n")
    print(str(L4) + " sorted to " + str(insertionSort(L4)) + "\n")
    print(str(L5) + " sorted to " + str(insertionSort(L5)) + "\n")
    
# Output
'''
[3, 4, 5, 6, 7, 8] sorted to [3, 4, 5, 6, 7, 8]

[9, 8, 7, 6, 5, 4, 3, 2, 1] sorted to [1, 2, 3, 4, 5, 6, 7, 8, 9]

[17, 2, 19, 21, 7, 1, 43] sorted to [1, 2, 7, 17, 19, 21, 43]

[1, 2, 56, 52, 47, 18] sorted to [1, 2, 18, 47, 52, 56]

[260, 77, 45, 98] sorted to [45, 77, 98, 260]
'''
    