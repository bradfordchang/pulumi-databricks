// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Databricks.Inputs
{

    public sealed class RepoSparseCheckoutGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("patterns", required: true)]
        private InputList<string>? _patterns;
        public InputList<string> Patterns
        {
            get => _patterns ?? (_patterns = new InputList<string>());
            set => _patterns = value;
        }

        public RepoSparseCheckoutGetArgs()
        {
        }
        public static new RepoSparseCheckoutGetArgs Empty => new RepoSparseCheckoutGetArgs();
    }
}
