# Finding tag in a list

The class `Product` has the attributes `id`, `description` and `tags`.

`tags` is an `ArrayList` of `String`'s that contains the tags that belong to a product. By adding multiple tags to a product we can make a better search for a product that satisfies a search query.

The main application is an example of this. A list of products is created and the user is asked for a search term that is used to search in the list for a product that contains this term as a tag.

However the method `hasTag(String tag)` of `Product` is not implemented. This needs to be done to get a working application. The method should check the tags list inside a product to see if any of the tags equals the provided search term. If so it should return `true`. In case no tag satisfies the given term, the method should return `false`.

Example 1:

```text
What tag would you like to look for: soda
A bottle of cola has a tag soda
```

Example 2:

```text
What tag would you like to look for: cheddar
No products with tag cheddar
```
