![img_1.png](docs/images/title.png)


AI and LLM friendly annotations that be :fire:

Related and associated prompts in the /prompts/ folder.

[LLM Markers](#llm-markers)

[Performance Markers](#performance-markers)

[Threading Markers](#threading-markers)

[Testing Markers](#testing-markers)

Polyglot annotations coming soon.

## Marker Annotations

Annotations as a form of documentation and context for LLMs and AI Agents.

### LLM Markers

Markers you can reference from prompts. Includes guard rails.

#### @CheckBeforeModifying

Check explicitly with the operator before modifying this code.

#### @Only.*

Only allow specific models to create or modify code.

Variants included for:

* Claude - ```@OnlyClaude```
* Gemini - ```@OnlyGemini```
* GPT - ```@OnlyGPT```
* Llama - ```@OnlyLlama```
* Qwen - ```@OnlyQwen```

### Performance Markers


#### .*Optimised and .*Concerned

Markers used to convey something about how the code was written for 
performance or the LLM should be concerned about when writing the code.

Variants included for:

* CPU - ```@CPUConcerned``` and ```@CPUOptimised```
* Cache - ```@CacheConcerned``` and ```@CacheOptimised```
* Memory - ```@MemoryConcerned``` and ```@MemoryOptimised```
* GC - ```@GCConcerned``` and ```@GCOptimised```
* Network - ```@NetworkIOConcerned``` and ```@NetworkIOOptimised```
* IO - ```@IOConcerned``` and ```@IOOptimised```

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