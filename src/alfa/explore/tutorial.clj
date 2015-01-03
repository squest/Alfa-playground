(ns alfa.explore.tutorial
  (:require [questdb.core :refer :all]))

(def db "qdb")

(declare square)

(defn more []
  (square 9))

