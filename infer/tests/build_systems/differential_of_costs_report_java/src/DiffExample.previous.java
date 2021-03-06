/*
 * Copyright (c) Facebook, Inc. and its affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */
 
import java.util.ArrayList;

// This class has the following costs:
// constructor: constant
// private access$000 method for accessing f4 
// f1: linear
// f2: quadratic
// f4: constant
// f5: linear
// f6: quadratic
// f7: top

public class DiffExample {

  int z;
  ArrayList<String> list =
      new ArrayList<String>() {
 
        @Override
        public String toString() {
          f4(z);  
          return super.toString();
        }
      };
    // cost: linear
    private static int f1(int k) {
        for (int i = 0; i < k; i++) {
        }
        return 0;
    }

    // cost: quadratic
    private static void f2(int k) {
        for (int i = 0; i < k; i++) {
            f1(k);
        }
    }

    // cost: constant
    private static int f4(int k) {
        int i = 1;
        return i + k;
    }

    // cost: linear
    private static void f5(int n) {
        f1(n);
    }

    // cost: quadratic
    private static void f6(int n) {
        f2(n);
    }

    // cost: top
    private static void f7(int k) {
        int i = 0;
        while (i >=0) {
            i++;
        }
    }

   private void f8() {
       int x = 0;
   }

  void f10(int x) {
    throw new IllegalArgumentException("Not implemented yet");
  }
}
