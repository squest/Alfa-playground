(ns alfa.one
  (:require [enfocus.core :as ef]
            [enfocus.effects :as eff])
  (:require-macros [enfocus.macros :as em]))

(defn init-page
  []
  (ef/at "#subtitle"
         (ef/transform-content
          (ef/replace-vars {:enfocus "This is enfocus"}))))

(set! (.-onload js/document)
      (init-page))





