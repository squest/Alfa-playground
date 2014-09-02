(ns alfa.tryout.pages
  (:require [net.cgrand.enlive-html :as el]
            [net.cgrand.reload :refer [auto-reload]]))

(auto-reload *ns*)

(def pages "templates/pages/")
(def base-page (str pages "base.html"))

(el/deftemplate
  home-template base-page []
  [:h1] (el/transform-content
         (el/replace-vars
          {:enlive "This comes from enlive"})))

(defn homepage
  []
  (apply str (home-template)))









