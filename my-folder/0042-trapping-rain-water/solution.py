class Solution:
    def trap(self, height: List[int]) -> int:
        sum = 0
        l_max = r_max = 0
        n = len(height)
        l = 0
        r = n - 1
        while l < r:
            if height[l] < height[r]:
                l_max = max(l_max, height[l])
                sum += l_max - height[l]
                l += 1
            else:
                r_max = max(r_max, height[r])
                sum += r_max - height[r]
                r -= 1
        return sum




        l_max = [0] * n
        r_max = [0] * n

        for i in range(n):
            j = -i - 1
            l_max[i] = l_wall
            r_max[j] = r_wall
            l_wall = max(l_wall, height[i])
            r_wall = max(r_wall, height[j])

        for i in range(n):
            minn = min(l_max[i], r_max[i])
            sum += max(0, minn - height[i])
        return sum
