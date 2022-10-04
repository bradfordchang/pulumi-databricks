// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobPythonWheelTask {
    /**
     * @return Python function as entry point for the task
     * 
     */
    private @Nullable String entryPoint;
    /**
     * @return Named parameters for the task
     * 
     */
    private @Nullable Map<String,Object> namedParameters;
    /**
     * @return Name of Python package
     * 
     */
    private @Nullable String packageName;
    /**
     * @return (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
     * 
     */
    private @Nullable List<String> parameters;

    private JobPythonWheelTask() {}
    /**
     * @return Python function as entry point for the task
     * 
     */
    public Optional<String> entryPoint() {
        return Optional.ofNullable(this.entryPoint);
    }
    /**
     * @return Named parameters for the task
     * 
     */
    public Map<String,Object> namedParameters() {
        return this.namedParameters == null ? Map.of() : this.namedParameters;
    }
    /**
     * @return Name of Python package
     * 
     */
    public Optional<String> packageName() {
        return Optional.ofNullable(this.packageName);
    }
    /**
     * @return (Map) parameters to be used for each run of this task. The SQL alert task does not support custom parameters.
     * 
     */
    public List<String> parameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPythonWheelTask defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String entryPoint;
        private @Nullable Map<String,Object> namedParameters;
        private @Nullable String packageName;
        private @Nullable List<String> parameters;
        public Builder() {}
        public Builder(JobPythonWheelTask defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entryPoint = defaults.entryPoint;
    	      this.namedParameters = defaults.namedParameters;
    	      this.packageName = defaults.packageName;
    	      this.parameters = defaults.parameters;
        }

        @CustomType.Setter
        public Builder entryPoint(@Nullable String entryPoint) {
            this.entryPoint = entryPoint;
            return this;
        }
        @CustomType.Setter
        public Builder namedParameters(@Nullable Map<String,Object> namedParameters) {
            this.namedParameters = namedParameters;
            return this;
        }
        @CustomType.Setter
        public Builder packageName(@Nullable String packageName) {
            this.packageName = packageName;
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable List<String> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(String... parameters) {
            return parameters(List.of(parameters));
        }
        public JobPythonWheelTask build() {
            final var o = new JobPythonWheelTask();
            o.entryPoint = entryPoint;
            o.namedParameters = namedParameters;
            o.packageName = packageName;
            o.parameters = parameters;
            return o;
        }
    }
}
