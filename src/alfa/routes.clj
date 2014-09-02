(ns alfa.routes
  (:require [compojure.core :refer :all]
            [noir.response :as resp]
            [alfa.tryout.pages :as to]))

(def home
  (context "/" req
           (GET "/" req
                (to/homepage))))
