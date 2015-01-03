(defproject
  alfa "0.1.0"
  :repl-options {:init-ns alfa.repl}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2322"]
                 [ring-server "0.3.1"]
                 [com.taoensso/timbre "3.3.0"]
                 [http-kit "2.1.19"]
                 [enfocus "2.1.0"]
                 [kioo "0.4.0"]
                 [reagent "0.4.2"]
                 [sablono "0.2.22"]
                 [om "0.7.1"]
                 [hiccup "1.0.5"]
                 [ring-cors "0.1.4"]
                 [lib-noir "0.8.6"]
                 [com.ashafa/clutch "0.4.0-RC1"]
                 [com.cemerick/url "0.1.1"]
                 [rm-hull/monet "0.1.12"]
                 [enlive "1.1.5"]
                 [org.clojars.gardendb/gardendb "0.1.8"]
                 [noir-exception "0.2.2"]
                 [environ "1.0.0"]
                 [zenedu.squest/questdb "0.2.0"]
                 [markdown-clj "0.9.47"]
                 [im.chit/cronj "1.4.2"]
                 [com.taoensso/carmine "2.7.0"]
                 [cljs-ajax "0.2.6"]
                 [secretary "1.2.0"]
                 [expectations "2.0.9"]]

  :cljsbuild {:builds
              [{:source-paths ["src-cljs"],
                :compiler
                {:pretty-print  true,
                 :output-dir    "resources/public/js/",
                 :source-map    true,
                 :output-to     "resources/public/js/app.js",
                 :optimizations :none},
                :id           "dev"}
               {:source-paths ["src-cljs"],
                :compiler
                {:pretty-print     false,
                 :closure-warnings {:non-standard-jsdoc :off},
                 :output-to        "resources/public/js/app.js",
                 :output-wrapper   false,
                 :optimizations    :simple},
                :id           "prod"}]}

  :ring {:handler alfa.handler/app,
         :init alfa.handler/init,
         :destroy alfa.handler/destroy}

  :profiles {:uberjar    {:aot :all},
             :production {:ring {:open-browser? false, :stacktraces? false, :auto-reload? false}},
             :dev        {:dependencies [[ring-mock "0.1.5"]
                                         [ring/ring-devel "1.3.1"]
                                         [pjstadig/humane-test-output "0.6.0"]],
                          :injections [(require 'pjstadig.humane-test-output)
                                       (pjstadig.humane-test-output/activate!)],
                          :env          {:dev true}}}

  :url "http://zenius.net"

  :main alfa.core
  :jvm-opts ["-server"]
  :plugins [[lein-ring "0.8.11"]
            [lein-environ "1.0.0"]
            [lein-cljsbuild "1.0.3"]
            [lein-expectations "0.0.8"]
            [codox "0.8.10"]
            [lein-autoexpect "1.2.2"]
            [lein-doc-pdf "1.0.10"]]

  :description "Short-term solution for migrating to clojure"

  :min-lein-version "2.0.0")





