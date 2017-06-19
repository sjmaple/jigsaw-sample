# jigsaw-sample

This sample has two parts, a Module exercise and a Service exercice. When using this sample, make sure you are using a recent Java 9 build.

## Modules Example

Examine the runJava9Modules.sh script. Note the differences in how you compile and execute java classes using the module path, rather than the classpath. Execute this script and update the code so that you eliminate the errors one by one. If you get stuck there are three hints that can help you below:

1. Turn the code in org.zeroturnaround.hello and org.zeroturnaround.world into modules, by adding the module-info metadata.
2. Expose the org.zeroturnaround.world package in the module with the same nameby modifying the module descriptor.
3. Add a dependancy from the org.zeroturnaround.hello module to the org.zeroturnaround.world module by modifying the module descriptor.

The output you should see is simply "Hello World".

## Services Example

This example contains three modules, a consumer, an api and a provider. The consumer module will interact with the provider implementation via an interface in the api module. There is no direct link between the consumer and provider modules, which creates a much looser coupling between our code. Similar to the Modules example, execute the runJava9Services.sh script, debug and fix the issues until the code compiles and runs. Hints are below if you get stuck.

1. Add module-info descriptors for each module.
2. Expose the org.zeroturnaround.api package in the org.zeroturnaround.api module.
3. Add a dependancy from the org.zeroturnaround.consumer and org.zeroturnaround.provider modules to the org.zeroturnaround.api module.
4. Add a declaration to the org.zeroturnaround.consumer module to state we want to use the service interface org.zeroturnaround.api.MyService.
5. Add a declaration to the org.zeroturnaround.provider module to state we want to provide an implementation of org.zeroturnaround.api.MyService.

The expected output should be "Hello World, from org.zeroturnaround.provider.ProviderImpl!"

## JLink Example

The script "jlinkDemo.sh" can be found in the Services Example. Examine this script to see which modules we are explicitly adding to the image. Run the script and examine the image directory.

Compare the size of the image directory vs the size of the full Java 9 runtime, using the du -dk command.
