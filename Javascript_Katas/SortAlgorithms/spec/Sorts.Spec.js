describe('Sorts', function () {
  var subject;
  var fakeItems;
  var expectedSortedItems;

  beforeEach(function () {
    fakeItems = [5, 2, 6, 3, 1, 4];
    expectedSortedItems = [1, 2, 3, 4, 5, 6];

    subject = Sorts.create();
  });

  it('correctly sorts items using a bubble sort', function () {
    expect(subject.bubbleSort(fakeItems)).toEqual(expectedSortedItems);
  });

  it('correctly sorts items using a selection sort', function () {
    expect(subject.selectionSort(fakeItems)).toEqual(expectedSortedItems);
  });

  it('correctly sorts items using a insertion sort', function () {
    expect(subject.insertionSort(fakeItems)).toEqual(expectedSortedItems);
  });

  it('correctly sorts items using a shell sort', function () {
    expect(subject.shellSort(fakeItems)).toEqual(expectedSortedItems);
  });

  it('correctly sorts items using a heap sort', function () {
    expect(subject.heapSort(fakeItems)).toEqual(expectedSortedItems);
  });

  it('correctly sorts items using a merge sort', function () {
    expect(subject.mergeSort(fakeItems)).toEqual(expectedSortedItems);
  });

  it('correctly sorts items using a quick sort', function () {
    expect(subject.quicksort(fakeItems)).toEqual(expectedSortedItems);
  });

  it('correctly retrieves the correct item using a binary search', function () {
    fakeItems = subject.quicksort(fakeItems);
    expect(subject.binarySearch(fakeItems, 4)).toEqual(3);
  });
});
