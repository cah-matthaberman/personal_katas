var Sorts = {
  //BFS ShortestPath
  //DFS Super Deep tree to limit searches
  //Graph for non binary tree
  //indexOf is O(n)

  create: function () {

    // O(n^2)
    function bubbleSort(items) {
      for (var i = items.length - 1; i >= 0; i--) {
        for (var k = 0; k <= i; k++) {
          if (items[k] > items[k + 1]) {
            swap(items, k + 1, k);
          }
        }
      }

      return items
    }

    // O(n^2)
    function selectionSort(items) {
      for (var i = 0; i < items.length; i++) {
        var minIndex = i;
        for (var j = i + 1; j < items.length; j++) {
          if (items[minIndex] > items[j]) {
            minIndex = j;
          }
        }
        swap(items, minIndex, i);
      }

      return items;
    }

    // O(n^2)
    function insertionSort(items, startingPosition) {
      for (var i = startingPosition || 0; i < items.length; i++) {
        var currentValue = items[i];

        for (var j = i - 1; j > -1 && items[j] > currentValue; j--) {
          items[j + 1] = items[j];
        }

        items[j + 1] = currentValue;
      }

      return items;
    }

    // O(n(log(n)^2)
    function shellSort(items) {
      for (var gap = Math.floor(items.length / 2); gap > 0; gap = parseInt(gap / 2)) {
        insertionSort(items, gap);
      }

      return items;
    }

    // O(n(log(n))
    function heapSort(items) {
      var itemLength = items.length;
      buildHeap(items);

      for (var i = items.length - 1; i > 0; i--) {
        swap(items, 0, i);
        itemLength--;
        sheapify(items, 0, itemLength);
      }

      return items;
    }

    function buildHeap(items) {
      for (var i = parseInt(items.length / 2); i >= 0; i -= 1) {
        sheapify(items, i, items.length);
      }
    }

    function sheapify(items, i, itemLength) {
      var left = 2 * i + 1;
      var right = 2 * i + 2;
      var largest = i;

      if (left < itemLength && items[left] > items[largest]) {
        largest = left;
      }

      if (right < itemLength && items[right] > items[largest]) {
        largest = right;
      }

      if (largest != i) {
        swap(items, i, largest);
        sheapify(items, i);
      }
    }

    // O(n(log(n))
    function mergeSort(items) {
      if (items.length < 2) {
        return items;
      }

      var middle = parseInt(items.length / 2);
      var left = items.slice(0, middle);
      var right = items.slice(middle, items.length);

      return merge(mergeSort(left), mergeSort(right));
    }

    function merge(left, right) {
      var result = [];

      while (left.length && right.length) {
        var shiftType = left[0] <= right[0] ? left.shift() : right.shift();
        result.push(shiftType);
      }

      while (left.length) {
        result.push(left.shift());
      }

      while (right.length) {
        result.push(right.shift())
      }

      return result;
    }

    function quicksort(items) {
      if (items.length === 0) {
        return [];
      }
      var left = [];
      var right = [];
      var pivot = items[0];

      for (var i = 1; i < items.length; i++) {
        if (items[i] < pivot) {
          left.push(items[i]);
        } else {
          right.push(items[i]);
        }
      }

      return quicksort(left).concat(pivot, quicksort(right));
    }

    // O(log n)
    function binarySearch(items, value) {
      var startIndex = 0;
      var stopIndex = items.length - 1;
      var middle = parseInt((startIndex + stopIndex) / 2);

      while (startIndex < stopIndex) {
        if (value < items[middle]) {
          stopIndex--;
        } else if (value > items[middle]) {
          startIndex = middle + 1;
        } else {
          return middle;
        }

        middle = parseInt((startIndex + stopIndex) / 2);
      }

      return -1;
    }

    function swap(array, lowerNumberIndex, greaterNumberIndex) {
      var tempItem = array[lowerNumberIndex];
      array[lowerNumberIndex] = array[greaterNumberIndex];
      array[greaterNumberIndex] = tempItem;
    }

    return {
      bubbleSort: bubbleSort,
      selectionSort: selectionSort,
      insertionSort: insertionSort,
      shellSort: shellSort,
      heapSort: heapSort,
      mergeSort: mergeSort,
      quicksort: quicksort,
      binarySearch: binarySearch
    }
  }
};