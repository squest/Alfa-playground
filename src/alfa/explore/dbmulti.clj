(ns alfa.explore.dbmulti
  (:require [com.ashafa.clutch :as cl]
            [questdb.core :as qdb]
            [gardendb.core :as gc]
            [taoensso.carmine :as car :refer [wcar]]))

(def db "mydb")
