(ns sample.core-test
  (:require [clojure.test :refer :all]
            [sample.core :refer :all]))

(deftest a-test
  (testing "Simple addition"
    (is (= 16 (-main 5)))))
