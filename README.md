#UTILX – The fluent Util API

UtilX is a prove of concept fluent Apache-Commons utility wrapper.

The fluent API allows for clearer more concise syntax, as opposed to the standard static method interactions.

Examples:
```
StringUtils.isEmpty(foo);
Is.string(foo).empty();

StringUtils.contains(foo, "o");
Does.string(foo).contain("o");

StringUtils.join(new String[]{"a","b","c"}, ", ");
Join.strings("a", "b", "c").withSeperator(", ");
```

#Note:
This approach may have adverse effects on application performance, as the extra object allocation caused by UtilX may result in more frequent Minor GC.

Homepage: http://www.knitelius.com/utilx/
