// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.databricks.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNodeTypePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNodeTypePlainArgs Empty = new GetNodeTypePlainArgs();

    /**
     * Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq &#39;.node_types[]|.category&#39;|sort |uniq`):
     * * `General Purpose` (all clouds)
     * * `General Purpose (HDD)` (Azure)
     * * `Compute Optimized` (all clouds)
     * * `Memory Optimized` (all clouds)
     * * `Memory Optimized (Remote HDD)` (Azure)
     * * `Storage Optimized` (AWS, Azure)
     * * `GPU Accelerated` (AWS, Azure)
     * 
     */
    @Import(name="category")
    private @Nullable String category;

    /**
     * @return Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq &#39;.node_types[]|.category&#39;|sort |uniq`):
     * * `General Purpose` (all clouds)
     * * `General Purpose (HDD)` (Azure)
     * * `Compute Optimized` (all clouds)
     * * `Memory Optimized` (all clouds)
     * * `Memory Optimized (Remote HDD)` (Azure)
     * * `Storage Optimized` (AWS, Azure)
     * * `GPU Accelerated` (AWS, Azure)
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * Number of gigabytes per core available on instance. Conflicts with `min_memory_gb`. Defaults to *0*.
     * 
     */
    @Import(name="gbPerCore")
    private @Nullable Integer gbPerCore;

    /**
     * @return Number of gigabytes per core available on instance. Conflicts with `min_memory_gb`. Defaults to *0*.
     * 
     */
    public Optional<Integer> gbPerCore() {
        return Optional.ofNullable(this.gbPerCore);
    }

    /**
     * if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
     * 
     */
    @Import(name="graviton")
    private @Nullable Boolean graviton;

    /**
     * @return if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
     * 
     */
    public Optional<Boolean> graviton() {
        return Optional.ofNullable(this.graviton);
    }

    /**
     * . Pick only nodes that have IO Cache. Defaults to *false*.
     * 
     */
    @Import(name="isIoCacheEnabled")
    private @Nullable Boolean isIoCacheEnabled;

    /**
     * @return . Pick only nodes that have IO Cache. Defaults to *false*.
     * 
     */
    public Optional<Boolean> isIoCacheEnabled() {
        return Optional.ofNullable(this.isIoCacheEnabled);
    }

    /**
     * Pick only nodes with local storage. Defaults to *false*.
     * 
     */
    @Import(name="localDisk")
    private @Nullable Boolean localDisk;

    /**
     * @return Pick only nodes with local storage. Defaults to *false*.
     * 
     */
    public Optional<Boolean> localDisk() {
        return Optional.ofNullable(this.localDisk);
    }

    /**
     * Pick only nodes that have size local storage greater or equal to given value. Defaults to *0*.
     * 
     */
    @Import(name="localDiskMinSize")
    private @Nullable Integer localDiskMinSize;

    /**
     * @return Pick only nodes that have size local storage greater or equal to given value. Defaults to *0*.
     * 
     */
    public Optional<Integer> localDiskMinSize() {
        return Optional.ofNullable(this.localDiskMinSize);
    }

    /**
     * Minimum number of CPU cores available on instance. Defaults to *0*.
     * 
     */
    @Import(name="minCores")
    private @Nullable Integer minCores;

    /**
     * @return Minimum number of CPU cores available on instance. Defaults to *0*.
     * 
     */
    public Optional<Integer> minCores() {
        return Optional.ofNullable(this.minCores);
    }

    /**
     * Minimum number of GPU&#39;s attached to instance. Defaults to *0*.
     * 
     */
    @Import(name="minGpus")
    private @Nullable Integer minGpus;

    /**
     * @return Minimum number of GPU&#39;s attached to instance. Defaults to *0*.
     * 
     */
    public Optional<Integer> minGpus() {
        return Optional.ofNullable(this.minGpus);
    }

    /**
     * Minimum amount of memory per node in gigabytes. Defaults to *0*.
     * 
     */
    @Import(name="minMemoryGb")
    private @Nullable Integer minMemoryGb;

    /**
     * @return Minimum amount of memory per node in gigabytes. Defaults to *0*.
     * 
     */
    public Optional<Integer> minMemoryGb() {
        return Optional.ofNullable(this.minMemoryGb);
    }

    /**
     * Pick only nodes that can run Photon driver. Defaults to *false*.
     * 
     */
    @Import(name="photonDriverCapable")
    private @Nullable Boolean photonDriverCapable;

    /**
     * @return Pick only nodes that can run Photon driver. Defaults to *false*.
     * 
     */
    public Optional<Boolean> photonDriverCapable() {
        return Optional.ofNullable(this.photonDriverCapable);
    }

    /**
     * Pick only nodes that can run Photon workers. Defaults to *false*.
     * 
     */
    @Import(name="photonWorkerCapable")
    private @Nullable Boolean photonWorkerCapable;

    /**
     * @return Pick only nodes that can run Photon workers. Defaults to *false*.
     * 
     */
    public Optional<Boolean> photonWorkerCapable() {
        return Optional.ofNullable(this.photonWorkerCapable);
    }

    /**
     * Pick only nodes that support port forwarding. Defaults to *false*.
     * 
     */
    @Import(name="supportPortForwarding")
    private @Nullable Boolean supportPortForwarding;

    /**
     * @return Pick only nodes that support port forwarding. Defaults to *false*.
     * 
     */
    public Optional<Boolean> supportPortForwarding() {
        return Optional.ofNullable(this.supportPortForwarding);
    }

    @Import(name="vcpu")
    private @Nullable Boolean vcpu;

    public Optional<Boolean> vcpu() {
        return Optional.ofNullable(this.vcpu);
    }

    private GetNodeTypePlainArgs() {}

    private GetNodeTypePlainArgs(GetNodeTypePlainArgs $) {
        this.category = $.category;
        this.gbPerCore = $.gbPerCore;
        this.graviton = $.graviton;
        this.isIoCacheEnabled = $.isIoCacheEnabled;
        this.localDisk = $.localDisk;
        this.localDiskMinSize = $.localDiskMinSize;
        this.minCores = $.minCores;
        this.minGpus = $.minGpus;
        this.minMemoryGb = $.minMemoryGb;
        this.photonDriverCapable = $.photonDriverCapable;
        this.photonWorkerCapable = $.photonWorkerCapable;
        this.supportPortForwarding = $.supportPortForwarding;
        this.vcpu = $.vcpu;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNodeTypePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNodeTypePlainArgs $;

        public Builder() {
            $ = new GetNodeTypePlainArgs();
        }

        public Builder(GetNodeTypePlainArgs defaults) {
            $ = new GetNodeTypePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param category Node category, which can be one of (depending on the cloud environment, could be checked with `databricks clusters list-node-types|jq &#39;.node_types[]|.category&#39;|sort |uniq`):
         * * `General Purpose` (all clouds)
         * * `General Purpose (HDD)` (Azure)
         * * `Compute Optimized` (all clouds)
         * * `Memory Optimized` (all clouds)
         * * `Memory Optimized (Remote HDD)` (Azure)
         * * `Storage Optimized` (AWS, Azure)
         * * `GPU Accelerated` (AWS, Azure)
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable String category) {
            $.category = category;
            return this;
        }

        /**
         * @param gbPerCore Number of gigabytes per core available on instance. Conflicts with `min_memory_gb`. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder gbPerCore(@Nullable Integer gbPerCore) {
            $.gbPerCore = gbPerCore;
            return this;
        }

        /**
         * @param graviton if we should limit the search only to nodes with AWS Graviton CPUs. Default to *false*.
         * 
         * @return builder
         * 
         */
        public Builder graviton(@Nullable Boolean graviton) {
            $.graviton = graviton;
            return this;
        }

        /**
         * @param isIoCacheEnabled . Pick only nodes that have IO Cache. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder isIoCacheEnabled(@Nullable Boolean isIoCacheEnabled) {
            $.isIoCacheEnabled = isIoCacheEnabled;
            return this;
        }

        /**
         * @param localDisk Pick only nodes with local storage. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder localDisk(@Nullable Boolean localDisk) {
            $.localDisk = localDisk;
            return this;
        }

        /**
         * @param localDiskMinSize Pick only nodes that have size local storage greater or equal to given value. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder localDiskMinSize(@Nullable Integer localDiskMinSize) {
            $.localDiskMinSize = localDiskMinSize;
            return this;
        }

        /**
         * @param minCores Minimum number of CPU cores available on instance. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder minCores(@Nullable Integer minCores) {
            $.minCores = minCores;
            return this;
        }

        /**
         * @param minGpus Minimum number of GPU&#39;s attached to instance. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder minGpus(@Nullable Integer minGpus) {
            $.minGpus = minGpus;
            return this;
        }

        /**
         * @param minMemoryGb Minimum amount of memory per node in gigabytes. Defaults to *0*.
         * 
         * @return builder
         * 
         */
        public Builder minMemoryGb(@Nullable Integer minMemoryGb) {
            $.minMemoryGb = minMemoryGb;
            return this;
        }

        /**
         * @param photonDriverCapable Pick only nodes that can run Photon driver. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder photonDriverCapable(@Nullable Boolean photonDriverCapable) {
            $.photonDriverCapable = photonDriverCapable;
            return this;
        }

        /**
         * @param photonWorkerCapable Pick only nodes that can run Photon workers. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder photonWorkerCapable(@Nullable Boolean photonWorkerCapable) {
            $.photonWorkerCapable = photonWorkerCapable;
            return this;
        }

        /**
         * @param supportPortForwarding Pick only nodes that support port forwarding. Defaults to *false*.
         * 
         * @return builder
         * 
         */
        public Builder supportPortForwarding(@Nullable Boolean supportPortForwarding) {
            $.supportPortForwarding = supportPortForwarding;
            return this;
        }

        public Builder vcpu(@Nullable Boolean vcpu) {
            $.vcpu = vcpu;
            return this;
        }

        public GetNodeTypePlainArgs build() {
            return $;
        }
    }

}
