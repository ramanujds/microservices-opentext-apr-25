
## Run a pod

```bash
kubectl run easy-recipes --image=ram1uj/easy-recipes

```

## Expose the pod (Creating a service)

```bash

kubectl expose pod easy-recipes --type=NodePort --port=80

```

## Get the service URL

```bash
minikube service easy-recipes --url
```

## Create a deployment

```bash
kubectl create deployment easy-recipes --image=ram1uj/easy-recipes
```

## Expose the deployment

```bash
kubectl expose deployment easy-recipes --type=NodePort --port=80
```

## Get the service URL

```bash
minikube service easy-recipes --url
```
