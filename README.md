![img_1.png](docs/images/title.png)


AI and LLM friendly annotations that be :fire:

Polyglot annotations coming soon.

[LLM Markers](#llm-markers)

[Performance Markers](#performance-markers)

[Threading Markers](#threading-markers)

[Testing Markers](#testing-markers)


## Marker Annotations

Annotations as a form of documentation.

### LLM Markers

Markers you can reference from prompts. Includes guard rails.

#### @CheckBeforeModifying

Check explicitly with the operator before modifying this code.

### Performance Markers

Markers used to convey something about how the code was written for performance.

#### @CPUOptimised

Generally written to be CPU optimal.

#### @CacheOptimised

Written or designed to be cache friendly.

#### @MemoryOptimised

Written or designed to be optimised for memory.

#### @GCOptimised

Written or designed to be optimised to minimise GC or pause times.

### Threading Markers

#### @SingleThreaded

Written for single threaded use.

#### @MultiThreaded

Written for multi threaded use.

### Testing Markers

Markers for writing test cases.

#### @HappyPath

A test that represents a happy path scenario.

#### @UnhappyPath

A test that represents an unhappy path scenario.

#### @InvalidParam

A test that exercises invalid parameters.

#### @ParamMaxExtrema

A test that exercises parameter extrema at the max.

#### @ParamMinExtrema

A test that exercises parameter extrema at the min.