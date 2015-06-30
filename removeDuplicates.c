int removeDuplicates(int* A, int n1) {
    int i, j;
    j = 0;
    for (i = 1; i < n1; i++)
    {
         if (A[i] != A[j])
        {
            j++;
            A[j] = A[i]; // Move it to the front
        }
    }
    return(j + 1);
}
