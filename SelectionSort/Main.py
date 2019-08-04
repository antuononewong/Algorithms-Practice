# Implementation of Selection Sort.
#
# Selection sort takes in a list/array of numbers of size n.
# It finds the minimum of i...n then places miniumum as lowest index i.
# For example minimum is 42 from 0...6. 42 will be placed at index 0. On the
# next iteration, the minimum will be found from 1....6, and placed at index 1.
# This will run until we reach the end of the list/array, where everything will
# be in sorted order.

# Standard implementations of min and list.index() are both O(n).
# Although this is a simple way to implement selection sort,
# the time complexity of this function is size * n^2. You'd have to
# pass through the list 2 times separately to find the minimum and
# the index of the minimum. A very large list size could cause problems in efficiency.
'''
def selectionSort (numbers : list) -> list:
    size = len(numbers)
    for i in range (0, size): 
        minimum = min(numbers[i:size])
        index = numbers.index(minimum)
        numbers[i], numbers[index] = numbers[index], numbers[i]
    return numbers
'''

# This is a more efficient implementation. We look at each element separately
# once, then find the element in a subarray where the first position will be
# where we place our found minimum. Time complexity of this function is O(n^2)
# , which is standard time complexity of selection sort, due to 2 nested loops.
def selectionSort (numbers : list) -> list:
    size = len(numbers)
    for i in range (0, size): #using indexes, but still looking through each element
        minimum = numbers[i]
        minimumIndex = i
        for j in range (i + 1, size):
            if (minimum > numbers[j]):
                minimum = numbers[j]
                minimumIndex = j      
        numbers[minimumIndex], numbers[i] = numbers[i], numbers[minimumIndex] 
        
    return numbers

if __name__ == '__main__':
    L1 = [1, 2, 3, 4, 5]
    L2 = [5, 4, 3, 2, 1]
    L3 = [11, 240, 1, 35, 50, 8, 7]
    L4 = [798, 14, 28, 5, 625]
    
    print(str(L1) + " sorted to " + str(selectionSort(L1)) + "\n")
    print(str(L2) + " sorted to " + str(selectionSort(L2)) + "\n")
    print(str(L3) + " sorted to " + str(selectionSort(L3)) + "\n")
    print(str(L4) + " sorted to " + str(selectionSort(L4)) + "\n")

# Output 
'''
[1, 2, 3, 4, 5] sorted to [1, 2, 3, 4, 5]

[5, 4, 3, 2, 1] sorted to [1, 2, 3, 4, 5]

[11, 240, 1, 35, 50, 8, 7] sorted to [1, 7, 8, 11, 35, 50, 240]

[798, 14, 28, 5, 625] sorted to [5, 14, 28, 625, 798]
'''