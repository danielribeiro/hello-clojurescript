(ns app
    (:require [app.world :as world]))

(ns foo
  (:require [clojure.browser.repl :as repl]))
(repl/connect "http://localhost:9000/repl")


(js/alert (world/default-string))