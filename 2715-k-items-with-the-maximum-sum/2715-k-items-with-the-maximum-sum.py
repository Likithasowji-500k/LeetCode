class Solution:
    def kItemsWithMaximumSum(self, numOnes: int, numZeros: int, numNegOnes: int, k: int) -> int:
        if k<=numOnes:
            return k
        elif (numOnes+numZeros)>=k:
            return numOnes
        else:
            return numOnes-(k-numZeros-numOnes)

        