#!/bin/bash

echo "-> Build demo"
mvn clean package

echo "-> Copy built demo"
rm -rf docs/*
cp -r target/vue-gwt-demo-*/VueGwtDemo docs/
cp target/vue-gwt-demo-*/index.html docs/
git add docs

echo "Success!"