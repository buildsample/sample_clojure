(ns sample.core-test
  (:require [clojure.test :refer :all]
            [sample.core :refer :all]))

(deftest a-test
  (testing "Simple addition"
    (is (= 14 (-main 5)))))
