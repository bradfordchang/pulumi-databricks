# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetClusterPolicyResult',
    'AwaitableGetClusterPolicyResult',
    'get_cluster_policy',
    'get_cluster_policy_output',
]

@pulumi.output_type
class GetClusterPolicyResult:
    """
    A collection of values returned by getClusterPolicy.
    """
    def __init__(__self__, definition=None, id=None, max_clusters_per_user=None, name=None):
        if definition and not isinstance(definition, str):
            raise TypeError("Expected argument 'definition' to be a str")
        pulumi.set(__self__, "definition", definition)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if max_clusters_per_user and not isinstance(max_clusters_per_user, int):
            raise TypeError("Expected argument 'max_clusters_per_user' to be a int")
        pulumi.set(__self__, "max_clusters_per_user", max_clusters_per_user)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def definition(self) -> str:
        """
        Policy definition: JSON document expressed in [Databricks Policy Definition Language](https://docs.databricks.com/administration-guide/clusters/policies.html#cluster-policy-definition).
        """
        return pulumi.get(self, "definition")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="maxClustersPerUser")
    def max_clusters_per_user(self) -> int:
        return pulumi.get(self, "max_clusters_per_user")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")


class AwaitableGetClusterPolicyResult(GetClusterPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetClusterPolicyResult(
            definition=self.definition,
            id=self.id,
            max_clusters_per_user=self.max_clusters_per_user,
            name=self.name)


def get_cluster_policy(name: Optional[str] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetClusterPolicyResult:
    """
    ## Example Usage

    Referring to a cluster policy by name:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    personal = databricks.get_cluster_policy(name="Personal Compute")
    my_cluster = databricks.Cluster("myCluster", policy_id=personal.id)
    # ...
    ```


    :param str name: Name of the cluster policy. The cluster policy must exist before this resource can be planned.
    """
    __args__ = dict()
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('databricks:index/getClusterPolicy:getClusterPolicy', __args__, opts=opts, typ=GetClusterPolicyResult).value

    return AwaitableGetClusterPolicyResult(
        definition=__ret__.definition,
        id=__ret__.id,
        max_clusters_per_user=__ret__.max_clusters_per_user,
        name=__ret__.name)


@_utilities.lift_output_func(get_cluster_policy)
def get_cluster_policy_output(name: Optional[pulumi.Input[str]] = None,
                              opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetClusterPolicyResult]:
    """
    ## Example Usage

    Referring to a cluster policy by name:

    ```python
    import pulumi
    import pulumi_databricks as databricks

    personal = databricks.get_cluster_policy(name="Personal Compute")
    my_cluster = databricks.Cluster("myCluster", policy_id=personal.id)
    # ...
    ```


    :param str name: Name of the cluster policy. The cluster policy must exist before this resource can be planned.
    """
    ...