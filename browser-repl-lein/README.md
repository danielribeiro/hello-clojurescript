# browser-repl-lein

Install [Leiningen](https://github.com/technomancy/leiningen/blob/master/README.md) `2.1.2` or higher.

To compile just use

```bash
$ lein cljsbuild once
```

To auto compile while you edit the source:

```bash
$ lein cljsbuild auto
```

You can view the examples by opening `index.html` in your favorite browser.

Once that is onde, execute the repl with:

```bash
$ lein trampoline cljsbuild repl-listen
```

and then you can run any clojurescript code in your browser:

```clj
(js/alert "hey")
(.log js/console "i can do stuff")
```
