# simple-lein

Install [Leiningen](https://github.com/technomancy/leiningen/blob/master/README.md) `2.1.2` or higher.

To compile just use

$ lein cljsbuild once

To auto compile while you edit the source:

$ lein cljsbuild auto

You can view the examples by opening `index.html` in your favorite browser.

## Gotchas

Note that index.html and project.clj refer to `simple_lein` (with a underscore `_`), whereas the clojrescript files refer to the namespaces as `simple-lein` (with a dash `-`).
