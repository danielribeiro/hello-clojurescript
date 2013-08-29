(ns app
    (:require [app.world :as world]))

(js/alert (world/default-string))

(defn hack-body [] (set! (.. js/document -body -innerHTML) "<h1>This has been hacked 2/h1>"))

;umcoment line below and command/control enter it to evaluate it

;(hack-body)
