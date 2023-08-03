# Flashing

```linux
sudo umount /dev/sda*
sudo bmaptool copy --bmap image-eris-beacon-eris-beacon-baseboard.wic.bmap image-eris-beacon-eris-beacon-baseboard.wic.bz2 /dev/sda
sudo umount /dev/sda*
```

## copy update image

### locally

```linux
sudo cp image-eris-beacon-swu-eris-beacon-baseboard.swu /media/jale/data/
sudo umount /dev/sda*
```

### using ssh

```linux
ssh-keygen -f "/home/jale/.ssh/known_hosts" -R "192.168.0.21"
scp image-eris-beacon-swu-eris-beacon-baseboard.swu root@192.168.0.21:/data/
```

## start update

```rpi
swupdate -e "eris-beacon-baseboard,mmcblk0p3" -i /data/image-eris-beacon-swu-eris-beacon-baseboard.swu -v
```

## connect USBIP

```linux
lsmod
sudo modprobe vhci-hcd
usbip list -r 192.168.0.21
ls /dev/ttyACM*
sudo usbip attach -r 192.168.0.21 -b 1-1
ls /dev/ttyACM*
minicom -D /dev/ttyACM1
```
