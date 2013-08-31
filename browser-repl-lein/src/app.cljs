(ns app
    (:require [app.world :as world]
              [clojure.browser.repl :as repl]))

(repl/connect "http://localhost:9000/repl")

(js/alert (world/default-string))

(map [1 2] identity)